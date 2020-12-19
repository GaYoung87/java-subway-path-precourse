package subway.view;

public class MainMenuOutputView {

    private static final String MAIN_MENU = "## 메인 화면\n1. 경로 조회\nQ. 종료\n";
    private static final String CHOOSE_COMMAND_MESSAGE = "## 원하는 기능을 선택하세요.";

    public static void printMainMenu() {
        System.out.println();
        System.out.println(MAIN_MENU);
        printChooseCommandMessage();
    }

    public static void printChooseCommandMessage() {
        System.out.println(CHOOSE_COMMAND_MESSAGE);
    }
}
