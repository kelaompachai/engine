package com.mirth.connect.client.ui;

import javax.swing.ImageIcon;

public class BrandingConstants {

    public static final String PRODUCT_NAME = "OpenIntegrationEngine";

    /*
        Sets the title of the Administrator window
     */
    public static final String WINDOW_TITLE = "OpenIntegrationEngine Administrator";

    public static final String ISSUE_TRACKER_LOCATION = "https://github.com/openintegrationengine/engine/issues";


    // The URL that is opened when clicking the bottom image in Login window
    // The one where you're asked for server URL, username, and password
    public static final String COMPANY_URL = "https://github.com/openintegrationengine";
    public static final String COMPANY_TOOLTIP = "OpenIntegrationEngine";


    // The URL that is opened when clicking the image in the Top right corner of the main administrator window
    public static final String PRODUCT_URL = "https://github.com/openintegrationengine";
    public static final String PRODUCT_TOOLTIP = "OpenIntegrationEngine";


    // The URL that is opened when clicking "Help" button in Administrator
    public static String HELP_URL_LOCATION = "https://github.com/OpenIntegrationEngine/engine/discussions";

    // The "More info" in Server settings "Provide usage statistics"
    public static final String PRIVACY_URL = "https://github.com/openintegrationengine";
    public static final String PRIVACY_TOOLTIP = "Privacy Information";

    // The URL that is opened when clicking "Visit + PRODUCT_NAME" button in Administrator
    public static final String HOMEPAGE_URL = "https://openintegrationengine.org/";

    // Icons
    public static final ImageIcon FAVICON = new ImageIcon(com.mirth.connect.client.ui.Frame.class.getResource("images/branding/rendered/oie_logo_favicon.png"));
    // These images must be at 215px x 30px scale
    public static final ImageIcon LOGO = new ImageIcon(com.mirth.connect.client.ui.Frame.class.getResource("images/branding/rendered/oie_logo_color.png"));
    public static final ImageIcon LOGO_GRAY = new ImageIcon(com.mirth.connect.client.ui.Frame.class.getResource("images/branding/rendered/oie_logo_white.png"));
}
