package vn.dinosys.dinosys_apptemplate.app;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import vn.dinosys.dinosys_apptemplate.R;
import vn.dinosys.dinosys_apptemplate.util.Constants;

/**
 * Created by htsi.
 * Since: 6/22/16 on 3:31 PM
 * Project: Dinosys-AppTemplate
 */
public class TemplateApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //  Set default font to MyriadPro
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath(Constants.APP_DEFAULT_FONT)
                .setFontAttrId(R.attr.fontPath)
                .build());
    }
}
