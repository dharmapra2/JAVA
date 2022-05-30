class Roman_to_integer {
    public int romanToInt(String s) {
        int temp = 0, count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int val = getval(s.charAt(i));
            if (val < temp)
                count -= val;
            else
                count += val;
            temp = val;
        }
        return count;
    }

    public int getval(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}
