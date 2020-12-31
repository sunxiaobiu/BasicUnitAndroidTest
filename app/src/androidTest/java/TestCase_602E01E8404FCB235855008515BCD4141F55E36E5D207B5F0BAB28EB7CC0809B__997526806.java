import android.app.Activity;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_602E01E8404FCB235855008515BCD4141F55E36E5D207B5F0BAB28EB7CC0809B__997526806 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131428410);
      ViewPager var5 = (ViewPager)var4;
      Object var1 = EasyMock.createMock(OnPageChangeListener.class);
      var5.removeOnPageChangeListener((OnPageChangeListener)var1);
   }

   public TestCase_602E01E8404FCB235855008515BCD4141F55E36E5D207B5F0BAB28EB7CC0809B__997526806() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
