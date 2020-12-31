import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_as_android_mpost_g4s_airport_759390018 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      NfcAdapter var1 = NfcAdapter.getDefaultAdapter(var4);
      Object var2 = EasyMock.createMock(PendingIntent.class);
      var1.enableForegroundDispatch(var4, (PendingIntent)var2, (IntentFilter[])null, (String[][])null);
   }

   public TestCase_as_android_mpost_g4s_airport_759390018() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
