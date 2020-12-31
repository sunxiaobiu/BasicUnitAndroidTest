import android.app.Activity;
import android.support.v7.widget.AppCompatTextView;
import android.text.method.MovementMethod;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5BD39C4D9EFF3F7E50F998D66A805389E27803E6A6780B9EA190E4B14D829C4A_689681377 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131296474);
      AppCompatTextView var5 = (AppCompatTextView)var4;
      Object var1 = EasyMock.createMock(MovementMethod.class);
      var5.setMovementMethod((MovementMethod)var1);
   }

   public TestCase_5BD39C4D9EFF3F7E50F998D66A805389E27803E6A6780B9EA190E4B14D829C4A_689681377() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
