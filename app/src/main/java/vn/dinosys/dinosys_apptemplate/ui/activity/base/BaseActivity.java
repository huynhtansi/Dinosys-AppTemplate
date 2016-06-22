package vn.dinosys.dinosys_apptemplate.ui.activity.base;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by htsi.
 * Since: 6/22/16 on 3:37 PM
 * Project: Dinosys-AppTemplate
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
