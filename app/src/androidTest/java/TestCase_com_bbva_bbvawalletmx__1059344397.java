import android.app.Activity;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.animation.Animation;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bbva_bbvawalletmx__1059344397 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131755654);
      NestedScrollView var5 = (NestedScrollView)var4;
      Object var1 = EasyMock.createMock(Animation.class);
      var5.setAnimation((Animation)var1);
   }

   public TestCase_com_bbva_bbvawalletmx__1059344397() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
