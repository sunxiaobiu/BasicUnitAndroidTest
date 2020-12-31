import android.app.Activity;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_602A08B8092C5D3C96B434E451821296AA4BAFCF6F781877CC17F570E1E8759A__293741471 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131296672);
      NestedScrollView var4 = (NestedScrollView)var3;
      var4.requestDisallowInterceptTouchEvent(false);
   }

   public TestCase_602A08B8092C5D3C96B434E451821296AA4BAFCF6F781877CC17F570E1E8759A__293741471() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
