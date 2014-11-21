package itak;

final class katakanaToModKunreiTable {
    final static biTable katakanaToModKunrei =  addchars(new biTable());
    
    private static biTable addchars(biTable katakanaToModKunrei) {
        katakanaToModKunrei = new biTable();

        katakanaToModKunrei.put("\u30a1", "xa");
        katakanaToModKunrei.put("\u30a2", "a");
        katakanaToModKunrei.put("\u30a3", "xi");
        katakanaToModKunrei.put("\u30a4", "i");
        katakanaToModKunrei.put("\u30a5", "xu");
        katakanaToModKunrei.put("\u30a6", "u");
        katakanaToModKunrei.put("\u30a7", "xe");
        katakanaToModKunrei.put("\u30a8", "e");
        katakanaToModKunrei.put("\u30a9", "xo");
        katakanaToModKunrei.put("\u30aa", "o");

        katakanaToModKunrei.put("\u30a5", "w");

        katakanaToModKunrei.put("\u30ab", "ka");
        katakanaToModKunrei.put("\u30ac", "ga");
        katakanaToModKunrei.put("\u30ad", "ki");
        katakanaToModKunrei.put("\u30ae", "gi");
        katakanaToModKunrei.put("\u30af", "ku");
        katakanaToModKunrei.put("\u30b0", "gu");
        katakanaToModKunrei.put("\u30b1", "ke");
        katakanaToModKunrei.put("\u30b2", "ge");
        katakanaToModKunrei.put("\u30b3", "ko");
        katakanaToModKunrei.put("\u30b4", "go");

        katakanaToModKunrei.put("\u30ad\u30e3", "kya");
        katakanaToModKunrei.put("\u30ad\u30e5", "kyu");
        katakanaToModKunrei.put("\u30ad\u30e7", "kyo");
        katakanaToModKunrei.put("\u30ae\u30e3", "gya");
        katakanaToModKunrei.put("\u30ae\u30e5", "gyu");
        katakanaToModKunrei.put("\u30ae\u30e7", "gyo");

        katakanaToModKunrei.put("\u30b5", "sa");
        katakanaToModKunrei.put("\u30b6", "za");
        katakanaToModKunrei.put("\u30b7", "shi");
        katakanaToModKunrei.put("\u30b8", "ji");
        katakanaToModKunrei.put("\u30b9", "su");
        katakanaToModKunrei.put("\u30ba", "zu");
        katakanaToModKunrei.put("\u30bb", "se");
        katakanaToModKunrei.put("\u30bc", "ze");
        katakanaToModKunrei.put("\u30bd", "so");
        katakanaToModKunrei.put("\u30be", "zo");

        katakanaToModKunrei.put("\u30ba\u30a3", "si");

        katakanaToModKunrei.put("\u30b7\u30e3", "sha");
        katakanaToModKunrei.put("\u30b7\u30e5", "shu");
        katakanaToModKunrei.put("\u30b7\u30e7", "sho");
        katakanaToModKunrei.put("\u30b8\u30e3", "ja");
        katakanaToModKunrei.put("\u30b8\u30e5", "ju");
        katakanaToModKunrei.put("\u30b8\u30e7", "jo");

        katakanaToModKunrei.put("\u30bf", "ta");
        katakanaToModKunrei.put("\u30c0", "da");
        katakanaToModKunrei.put("\u30c1", "chi");
        katakanaToModKunrei.put("\u30c6\u30a3", "ti");
        katakanaToModKunrei.put("\u30c2", "zi");


        katakanaToModKunrei.put("\u30c3", "sokuon");
        katakanaToModKunrei.put("\u30c4", "tsu");
        katakanaToModKunrei.put("\u30c5", "zu");
        katakanaToModKunrei.put("\u30c4\uff9f", "tu");

        katakanaToModKunrei.put("\u30c6", "te");
        katakanaToModKunrei.put("\u30c7", "de");
        katakanaToModKunrei.put("\u30c8", "to");
        katakanaToModKunrei.put("\u30c9", "do");

        katakanaToModKunrei.put("\u30c1\u30e3", "cha");
        katakanaToModKunrei.put("\u30c1\u30e5", "chu");
        katakanaToModKunrei.put("\u30c1\u30e7", "cho");
        katakanaToModKunrei.put("\u30c2\u30e3", "zya");
        katakanaToModKunrei.put("\u30c2\u30e5", "zyu");
        katakanaToModKunrei.put("\u30c2\u30e7", "zyo");

        katakanaToModKunrei.put("\u30ca", "na");
        katakanaToModKunrei.put("\u30cb", "ni");
        katakanaToModKunrei.put("\u30cc", "nu");
        katakanaToModKunrei.put("\u30cd", "ne");
        katakanaToModKunrei.put("\u30ce", "no");

        katakanaToModKunrei.put("\u30cb\u30e3", "nya");
        katakanaToModKunrei.put("\u30cb\u30e5", "nyu");
        katakanaToModKunrei.put("\u30cb\u30e7", "nyo");

        katakanaToModKunrei.put("\u30cf", "ha");
        katakanaToModKunrei.put("\u30d0", "ba");
        katakanaToModKunrei.put("\u30d1", "pa");
        katakanaToModKunrei.put("\u30d2", "hi");
        katakanaToModKunrei.put("\u30d3", "bi");
        katakanaToModKunrei.put("\u30d4", "pi");
        katakanaToModKunrei.put("\u30d5", "hu");
        katakanaToModKunrei.put("\u30d6", "bu");
        katakanaToModKunrei.put("\u30d7", "pu");
        katakanaToModKunrei.put("\u30d8", "he");
        katakanaToModKunrei.put("\u30d9", "be");
        katakanaToModKunrei.put("\u30da", "pe");
        katakanaToModKunrei.put("\u30db", "ho");
        katakanaToModKunrei.put("\u30dc", "bo");
        katakanaToModKunrei.put("\u30dd", "po");

        katakanaToModKunrei.put("\u30d2\u30e3", "hya");
        katakanaToModKunrei.put("\u30d2\u30e5", "hyu");
        katakanaToModKunrei.put("\u30d2\u30e7", "hyo");
        katakanaToModKunrei.put("\u30d3\u30e3", "bya");
        katakanaToModKunrei.put("\u30d3\u30e5", "byu");
        katakanaToModKunrei.put("\u30d3\u30e7", "byo");
        katakanaToModKunrei.put("\u30d4\u30e3", "pya");
        katakanaToModKunrei.put("\u30d4\u30e5", "pyu");
        katakanaToModKunrei.put("\u30d4\u30e7", "pyo");


        katakanaToModKunrei.put("\u30de", "ma");
        katakanaToModKunrei.put("\u30df", "mi");
        katakanaToModKunrei.put("\u30e0", "mu");
        katakanaToModKunrei.put("\u30e1", "me");
        katakanaToModKunrei.put("\u30e2", "mo");

        katakanaToModKunrei.put("\u30df\u30e3", "mya");
        katakanaToModKunrei.put("\u30df\u30e5", "myu");
        katakanaToModKunrei.put("\u30df\u30e7", "myo");

        katakanaToModKunrei.put("\u30e3", "xya");
        katakanaToModKunrei.put("\u30e4", "ya");
        katakanaToModKunrei.put("\u30e5", "xyu");
        katakanaToModKunrei.put("\u30e6", "yu");

        katakanaToModKunrei.put("\u30a7", "xye");
        katakanaToModKunrei.put("\u30a4\u30a7", "ye");

        katakanaToModKunrei.put("\u30e7", "xyo");
        katakanaToModKunrei.put("\u30e8", "yo");

        katakanaToModKunrei.put("\u30e9", "ra");
        katakanaToModKunrei.put("\u30ea", "ri");
        katakanaToModKunrei.put("\u30eb", "ru");
        katakanaToModKunrei.put("\u30ec", "re");
        katakanaToModKunrei.put("\u30ed", "ro");

        katakanaToModKunrei.put("\u30ea\u30e3", "rya");
        katakanaToModKunrei.put("\u30ea\u30e5", "ryu");
        katakanaToModKunrei.put("\u30ea\u30e7", "ryo");

        katakanaToModKunrei.put("\u30ee", "xwa");
        katakanaToModKunrei.put("\u30ef", "wa");
        katakanaToModKunrei.put("\u30f0", "wi");
        katakanaToModKunrei.put("\u30f1", "we");
        katakanaToModKunrei.put("\u30f2", "wo");

        katakanaToModKunrei.put("\u30f3", "n");

        /* Additional sounds */
        katakanaToModKunrei.put("\u30f7", "va");
        katakanaToModKunrei.put("\u30f8", "vi");
        katakanaToModKunrei.put("\u30f4", "vu");
        katakanaToModKunrei.put("\u30f9", "ve");
        katakanaToModKunrei.put("\u30fa", "vo");

        katakanaToModKunrei.put("\u30d5\u30a1", "fa");
        katakanaToModKunrei.put("\u30d5\u30a3", "fi");
        katakanaToModKunrei.put("\u30d5\u30a7", "fe");
        katakanaToModKunrei.put("\u30d5\u30a9", "fo");

        katakanaToModKunrei.put("\u31f0\uff9e","g");

        katakanaToModKunrei.put("\u31f0", "k");
        katakanaToModKunrei.put("\u30f5", "xka");
        katakanaToModKunrei.put("\u30f6", "xke");

        katakanaToModKunrei.put("\u31f1", "sh");
        katakanaToModKunrei.put("\u31f2", "s");

        katakanaToModKunrei.put("\u31f3", "t");
        katakanaToModKunrei.put("\u31f3\uff9e", "d");

        katakanaToModKunrei.put("\u31f4", "ng");

        katakanaToModKunrei.put("\u31f2\uff9e", "z");

        /* still need to figure out their use */
        katakanaToModKunrei.put("\u31f5", "xha");
        katakanaToModKunrei.put("\u31f6", "xhi");
        katakanaToModKunrei.put("\u31f7", "f");
        katakanaToModKunrei.put("\u31f8", "xhe");
        katakanaToModKunrei.put("\u31f9", "xho");

        katakanaToModKunrei.put("\u31fA", "m");

        katakanaToModKunrei.put("\u31f7\uff9f", "p");

        katakanaToModKunrei.put("\u31fB", "xra");
        katakanaToModKunrei.put("\u31fC", "xri");
        katakanaToModKunrei.put("\u31fD", "l");
        katakanaToModKunrei.put("\u31fE", "r");
        katakanaToModKunrei.put("\u31fF", "xro");

        katakanaToModKunrei.put("\u30fc", "onbiki");
        katakanaToModKunrei.put("\uff9e", "dakuten");
        katakanaToModKunrei.put("\uff9f", "maru");

        return katakanaToModKunrei;
    }
}
