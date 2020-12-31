import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.Toolbar;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01D40EE975431F28464DB03D697049FF598AC9E5EB466D3F21947ED896B3B883__961475148 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131296483);
      Toolbar var5 = (Toolbar)var4;
      Object var1 = null;
      var5.setNavigationOnClickListener((OnClickListener)var1);
   }

   public TestCase_01D40EE975431F28464DB03D697049FF598AC9E5EB466D3F21947ED896B3B883__961475148() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
