import java.util.Arrays;
import java.util.stream.Stream;

class RnaTranscription {

    String transcribe(String dnaStrand) {
       return dnaStrand.codePoints().map(c -> transcribeAux(Character.toUpperCase(c))).collect(StringBuilder::new,
               StringBuilder::appendCodePoint, StringBuilder::append).toString().replaceAll(" ", "");
    }

    private char transcribeAux(int c) {

        switch (c) {
            case 'G':
                return 'C';
            case 'C':
                return 'G';
            case 'T':
                return 'A';
            case 'A':
                return 'U';
            default:
                return ' ';

        }
    }

}
