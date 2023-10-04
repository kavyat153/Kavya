package week3.day1;

public class Chrome extends Browser{
	public void openIncognito() {
		System.out.println( "openIncognito()");
	}
	public void clearCache() {
		System.out.println("clearCache");
	}
	public static void main(String[] args) {
		Chrome cr=new Chrome();
		System.out.println("BrowserVersion:"+cr.browerVersion);
		System.out.println("BrowserName:"+cr.broweserName);
		cr.clearCache();
		cr.closeBrowser();
		cr.navigateBack();
		cr.openURL();
		cr.openIncognito();
		
	}

}
