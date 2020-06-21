package local.nix.second.level.tasks.stringHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringHandler {

        public static boolean checkIfStringIsCorrect(String s) {

            Map<Character, Character> brackets = new HashMap<>();
            brackets.put('{', '}');
            brackets.put('(', ')');
            brackets.put('[', ']');

            List<Character> listOfOpeningBrackets = new ArrayList<>();
            boolean result = true;


            int amountOfOpeningBraces = 0;
            int amountOfOpeningRoundBrackets = 0;
            int amountOfOpeningSquareBrackets = 0;

            int amountOfClosingBraces = 0;
            int amountOfClosingRoundBrackets = 0;
            int amountOfClosingSquareBrackets = 0;


            if (s.isEmpty()) { return result; }

            for(int i = 0; i < s.length(); i++) {

                switch(s.charAt(i)) {
                    case '{': amountOfOpeningBraces += 1; break;
                    case '(': amountOfOpeningRoundBrackets += 1; break;
                    case '[': amountOfOpeningSquareBrackets += 1; break;
                    case '}': amountOfClosingBraces += 1; break;
                    case ')': amountOfClosingRoundBrackets += 1; break;
                    case ']': amountOfClosingSquareBrackets += 1; break;

                }
            }

            if(amountOfOpeningBraces == amountOfClosingBraces && amountOfOpeningRoundBrackets == amountOfClosingRoundBrackets && amountOfOpeningSquareBrackets == amountOfClosingSquareBrackets) {

                for(int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                        listOfOpeningBrackets.add(s.charAt(i));
                    } else if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {
                        if(!brackets.get(listOfOpeningBrackets.get(listOfOpeningBrackets.size()-1)).equals(s.charAt(i))) {
                            result = false;
                            break;
                        } else {
                            listOfOpeningBrackets.remove(listOfOpeningBrackets.size()-1);
                        }
                    }
                }

            } else {

                return false;
            }

            return result;

        }
    }

