import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.Tab;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_leyes__1751090457 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131230948);
      TabLayout var5 = (TabLayout)var4;
      Tab var6 = var5.getTabAt(0);
      Object var1 = EasyMock.createMock(Drawable.class);
      var6.setIcon((Drawable)var1);
   }

   public TestCase_ar_com_lichtmaier_leyes__1751090457() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
