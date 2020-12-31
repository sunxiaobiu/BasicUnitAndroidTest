import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_596240D79E94C36FE23B1932E28D30A6D6D55FBA4D2599366F41EFD550AE1009_142132145 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131230830);
      ViewPager var5 = (ViewPager)var4;
      Object var1 = EasyMock.createMock(FragmentPagerAdapter.class);
      var5.setAdapter((PagerAdapter)var1);
   }

   public TestCase_596240D79E94C36FE23B1932E28D30A6D6D55FBA4D2599366F41EFD550AE1009_142132145() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
