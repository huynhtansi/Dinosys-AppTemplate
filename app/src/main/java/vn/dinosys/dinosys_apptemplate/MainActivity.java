package vn.dinosys.dinosys_apptemplate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.BindView;
import vn.dinosys.dinosys_apptemplate.ui.activity.base.BaseActivity;
import vn.dinosys.dinosys_apptemplate.ui.activity.template.FABActivity;
import vn.dinosys.dinosys_apptemplate.ui.activity.template.FullscreenActivity;
import vn.dinosys.dinosys_apptemplate.ui.activity.template.NavigationDrawer;
import vn.dinosys.dinosys_apptemplate.ui.activity.template.ScrollingActivity;
import vn.dinosys.dinosys_apptemplate.ui.activity.template.SettingsActivity;
import vn.dinosys.dinosys_apptemplate.ui.activity.template.TabActivity;
import vn.dinosys.dinosys_apptemplate.ui.activity.template.UserListActivity;

public class MainActivity extends BaseActivity {

    @BindView(android.R.id.list)
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView.setAdapter(ArrayAdapter.createFromResource(this, R.array.activity_templates, android.R.layout.simple_list_item_1));
        mListView.setOnItemClickListener((pAdapterView, pView, pPosition, pId) -> {
            Intent intent = null;
            switch (pPosition) {
                case 0:
                    intent = new Intent(MainActivity.this, FABActivity.class);
                    break;
                case 1:
                    intent = new Intent(MainActivity.this, FullscreenActivity.class);
                    break;
                case 2:
                    intent = new Intent(MainActivity.this, FABActivity.class);
                    break;
                case 3:
                    intent = new Intent(MainActivity.this, FABActivity.class);
                    break;
                case 4:
                    intent = new Intent(MainActivity.this, UserListActivity.class);
                    break;
                case 5:
                    intent = new Intent(MainActivity.this, NavigationDrawer.class);
                    break;
                case 6:
                    intent = new Intent(MainActivity.this, ScrollingActivity.class);
                    break;
                case 7:
                    intent = new Intent(MainActivity.this, SettingsActivity.class);
                    break;
                case 8:
                    intent = new Intent(MainActivity.this, TabActivity.class);
                    break;
                default:
                    break;
            }
            startActivity(intent);
        });
    }
}
