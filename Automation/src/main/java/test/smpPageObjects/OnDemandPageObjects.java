package main.java.test.smpPageObjects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OnDemandPageObjects {

	public AndroidDriver<WebElement> driver;
	public String vod_vpid = "p04rklby";
	public String Total_Duration;

	public OnDemandPageObjects() {
		// TODO Auto-generated constructor stub
	}

	// @AndroidFindBy(xpath="//android.view.ViewGroup/android.support.v7.widget.cx[1]/android.widget.ImageView[@index='0']")
	// public WebElement menu;

	@AndroidFindBy(id = "uk.co.bbc.avtestharnesssmp:id/hide_transport_panel_button")
	public WebElement transport;

	@AndroidFindBy(id = "uk.co.bbc.avtestharnesssmp:id/subtitles_view")
	public WebElement subtitle_view;


	// @AndroidFindBy(xpath="//android.widget.ListView/android.widget.LinearLayout[10]/android.widget.RelativeLayout/android.widget.TextView[@index='0'
	// and @text='VPID Browser']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='VPID Browser']")
	public WebElement vpid_browser;


	// @AndroidFindBy(xpath="//android.widget.EditText[@text='Enter vpid']")
	@AndroidFindBy(id = "uk.co.bbc.avtestharnesssmp:id/textVpid")
	public WebElement vpid_enter;

	@AndroidFindBy(id = "uk.co.bbc.avtestharnesssmp:id/buttonLoad")
	public WebElement vpid_load;

	@AndroidFindBy(id = "uk.co.bbc.avtestharnesssmp:id/placeholder_play_button")
	public WebElement vod_play;

	@AndroidFindBy(id = "uk.co.bbc.avtestharnesssmp:id/fullscreen_button")
	public WebElement vod_play_fullscreen;

	@AndroidFindBy(id = "uk.co.bbc.avtestharnesssmp:id/seek_progress_bar")
	public WebElement vod_play_seekbar;

	@AndroidFindBy(id = "uk.co.bbc.avtestharnesssmp:id/primary_title")
	public WebElement vod_play_title;

	@AndroidFindBy(id = "uk.co.bbc.avtestharnesssmp:id/turn_subtitles_on_button")
	public WebElement vod_play_subtitle;

	@AndroidFindBy(id = "uk.co.bbc.avtestharnesssmp:id/volume_button")
	public WebElement vod_play_volume;

	@AndroidFindBy(id = "uk.co.bbc.avtestharnesssmp:id/duration")
	public WebElement vod_play_total_duration;

	@AndroidFindBy(id = "uk.co.bbc.avtestharnesssmp:id/elapsed")
	public WebElement vod_play_elasped_duration;

	@AndroidFindBy(id = "uk.co.bbc.avtestharnesssmp:id/play_pause_container")
	public WebElement vod_play_pause;

	@AndroidFindBy(id = "uk.co.bbc.avtestharnesssmp:id/exit_fullscreen_button")
	public WebElement vod_play_fullscreen_exit;




}
