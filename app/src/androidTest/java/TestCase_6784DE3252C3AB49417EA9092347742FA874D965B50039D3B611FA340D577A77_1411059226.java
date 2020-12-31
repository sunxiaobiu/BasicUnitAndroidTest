import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.OnFinished;
import android.os.Handler;
import android.os.Parcelable;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6784DE3252C3AB49417EA9092347742FA874D965B50039D3B611FA340D577A77_1411059226 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      Intent var5 = var4.getIntent();
      Parcelable var6 = var5.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT_INTENT_SENDER");
      IntentSender var7 = (IntentSender)var6;
      Object var1 = null;
      Object var2 = EasyMock.createMock(Intent.class);
      var7.sendIntent((Context)var1, -1, (Intent)var2, (OnFinished)null, (Handler)null);
   }

   public TestCase_6784DE3252C3AB49417EA9092347742FA874D965B50039D3B611FA340D577A77_1411059226() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
