import android.app.Activity;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01D40EE975431F28464DB03D697049FF598AC9E5EB466D3F21947ED896B3B883__659537549 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131296483);
      Toolbar var4 = (Toolbar)var3;
      var4.setNavigationIcon(2131165276);
   }

   public TestCase_01D40EE975431F28464DB03D697049FF598AC9E5EB466D3F21947ED896B3B883__659537549() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
