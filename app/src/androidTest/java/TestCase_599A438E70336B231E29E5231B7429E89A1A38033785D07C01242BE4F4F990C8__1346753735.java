import android.app.Activity;
import android.content.res.ColorStateList;
import android.support.design.widget.NavigationView;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_599A438E70336B231E29E5231B7429E89A1A38033785D07C01242BE4F4F990C8__1346753735 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131296457);
      NavigationView var4 = (NavigationView)var3;
      var4.setItemIconTintList((ColorStateList)null);
   }

   public TestCase_599A438E70336B231E29E5231B7429E89A1A38033785D07C01242BE4F4F990C8__1346753735() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
