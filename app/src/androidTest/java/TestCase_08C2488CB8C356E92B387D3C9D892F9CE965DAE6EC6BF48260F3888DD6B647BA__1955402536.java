import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_08C2488CB8C356E92B387D3C9D892F9CE965DAE6EC6BF48260F3888DD6B647BA__1955402536 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var1 = var2.getActivity();
      Builder var3 = new Builder(var1);
      Object var4 = EasyMock.createMock(OnClickListener.class);
      var3.setNeutralButton(2131755201, (OnClickListener)var4);
   }

   public TestCase_08C2488CB8C356E92B387D3C9D892F9CE965DAE6EC6BF48260F3888DD6B647BA__1955402536() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
