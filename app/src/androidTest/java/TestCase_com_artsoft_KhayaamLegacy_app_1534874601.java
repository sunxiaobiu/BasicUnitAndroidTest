import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageButton;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_artsoft_KhayaamLegacy_app_1534874601 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131296257);
      AppCompatImageButton var5 = (AppCompatImageButton)var4;
      Object var1 = EasyMock.createMock(Drawable.class);
      var5.setImageDrawable((Drawable)var1);
   }

   public TestCase_com_artsoft_KhayaamLegacy_app_1534874601() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
