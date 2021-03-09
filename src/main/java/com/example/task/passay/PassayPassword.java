package com.example.task.passay;

import java.util.ArrayList;
import java.util.List;

import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.EnglishSequenceData;
import org.passay.IllegalSequenceRule;
import org.passay.LengthRule;
import org.passay.PasswordData;
import org.passay.PasswordValidator;
import org.passay.Rule;
import org.passay.RuleResult;

public class PassayPassword {
public static void main(String[] args) {
		
		String p = "asdF@234";

		List<Rule> rules = new ArrayList<>();
		rules.add(new LengthRule(8, 15));
		rules.add(new CharacterRule(EnglishCharacterData.UpperCase, 1));
		rules.add(new CharacterRule(EnglishCharacterData.LowerCase, 1));
		rules.add(new CharacterRule(EnglishCharacterData.Digit, 1));
		rules.add(new CharacterRule(EnglishCharacterData.Special, 1));

		rules.add(new IllegalSequenceRule(EnglishSequenceData.Alphabetical, 3, true));

		PasswordValidator validator = new PasswordValidator(rules);
		PasswordData password = new PasswordData(p);
		RuleResult result = validator.validate(password);

		if (result.isValid()) {
			System.out.println("Password validated.");
		} else {
			System.out.println("Invalid Password: " + validator.getMessages(result));
		}
	}
}


