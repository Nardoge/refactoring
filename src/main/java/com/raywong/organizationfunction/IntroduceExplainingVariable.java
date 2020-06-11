package com.raywong.organizationfunction;

/**
 * @Description: 引入解释性变量
 * @Author Ray.Wong
 * @Date 2020/6/11 13:58
 */
public class IntroduceExplainingVariable {

/*    public void doSomeThing(String platform, String browser, int resize) {

        if ((platform.toUpperCase().contains("MAC"))
                && (browser.toUpperCase().contains("IE")) && wasInitialized() && resize > 0) {
            System.out.println("doSomeThing");
        }
    }*/

    /**
     *  通过引入变量来解释复杂的表达式，让代码更具可读性
     *
     */

    public void doSomeThing(String platform, String browser, int resize) {
        boolean isMac = platform.toUpperCase().contains("MAC");
        boolean isIE = browser.toUpperCase().contains("IE");
        boolean isResize = resize > 0;
        if (isMac
                && isIE && wasInitialized() && isResize) {
            System.out.println("doSomeThing");
        }
    }

    private boolean wasInitialized() {
        return false;
    }
}
