package calculator;

class Roman {
    static String[] romanArray = new String[]{"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII",
            "XXIV", "XXV", "XXVI","XXVII","XXVIII","XXIX","XXX","XXXI", "XXXII", "XXXIII", "XXIV",
            "XXXV", "XXXVI","XXXVII","XXXVIII","XXXIX","XL", "XLI", "XLII", "XLIII", "XLIV", "XLV",
            "XLVI","XLVII","XLVIII","XLIX","L","LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX",
            "LX","LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX","LXX","LXXI", "LXXII",
            "LXXIII", "LXXIV", "LXXV", "LXXVI","LXXVII","LXXVIII","LXXIX","LXXX","LXXXI", "LXXXII", "LXXXIII",
            "LXXIV","LXXXV", "LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC","XCI", "XCII", "XCIII", "XCIV", "XCV",
            "XCVI", "XCVII", "XCVIII", "XCIX","C"};

    static boolean isRoman(String val) {
        for (int i = 0; i < romanArray.length; i++) {
            if (val.equals(romanArray[i])) {
                return true;
            }
        }
        return false;
    }

    //   Метод перевода из Арабских в Римские цифры.
    static String covertToRoman(int arabic){
        return romanArray[arabic];
    }

    //   Метод перевода в Арабские цифры.
    static int convertToArabic(String roman) {
        for (int i = 0; i < romanArray.length ; i++) {
            if (roman.equals(romanArray[i])) {
                return i;
            }
        }
        return -1;
    }
}
