import android.app.Activity;
import android.support.v4.view.PagerTabStrip;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5F50F828B729A7C3F73D672773C5B93D73110B83F3EB99B574C1DFA8903C6813_118960657 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131296455);
      PagerTabStrip var4 = (PagerTabStrip)var3;
      var4.setNonPrimaryAlpha(0.7F);
   }

   public TestCase_5F50F828B729A7C3F73D672773C5B93D73110B83F3EB99B574C1DFA8903C6813_118960657() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
