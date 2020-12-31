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
public class TestCase_03AA2E47862E91C338355045A863AC1F1AA336A8039B0D488004AE7E9E993801__694563096 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131296380);
      Toolbar var4 = (Toolbar)var3;
      var4.setPopupTheme(2131821220);
   }

   public TestCase_03AA2E47862E91C338355045A863AC1F1AA336A8039B0D488004AE7E9E993801__694563096() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
