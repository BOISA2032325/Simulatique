import java.util.Stack;

public class ValiderParanthesage {

    public boolean validerParanthesage(String chaine) {
        Stack<Character> parens = new Stack<>();

        for (int i = 0; i < chaine.length(); i++) {
            switch (chaine.charAt(i)) {
                case '(':
                    parens.push('(');
                    break;
                case ')':
                    if (parens.empty() || parens.pop() != '(')
                        return false;
                    break;
                case '[':
                    parens.push('[');
                    break;
                case ']':
                    if (parens.empty() || parens.pop() != ']')
                        return false;
                    break;
                case '{':
                    parens.push('{');
                    break;
                case '}':
                    if (parens.empty() || parens.pop() != '}')
                        return false;
                    break;
                case '<':
                    parens.push('<');
                    break;
                case '>':
                    if (parens.empty() || parens.pop() != '>')
                        return false;
                    break;
            }

        }
        return parens.empty();

    }


}
