import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3_1890778663 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131296578);
      Toolbar var5 = (Toolbar)var4;
      Object var1 = EasyMock.createMock(Drawable.class);
      var5.setOverflowIcon((Drawable)var1);
   }

   public TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3_1890778663() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
