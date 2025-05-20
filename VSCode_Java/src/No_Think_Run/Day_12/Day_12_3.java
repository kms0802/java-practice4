package No_Think_Run.Day_12;

public class Day_12_3 {
    public enum Day {
        MONDAY(false),
        TUESDAY(false),
        WENDSDAY(false),
        THUSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);

        private final boolean isHoliday;

        Day(boolean isHoliday) {
            this.isHoliday = isHoliday;
        }

        public boolean isHoliday(){
            return isHoliday;
        }
    }

    public static void main(String[]args) {
        
    }
}
