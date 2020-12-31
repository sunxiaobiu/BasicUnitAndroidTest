import android.app.Activity;
import android.nfc.NfcAdapter;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_as_android_mpost_g4s_airport_470386352 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      NfcAdapter var4 = NfcAdapter.getDefaultAdapter(var3);
      Object var1 = null;
      var4.disableForegroundDispatch((Activity)var1);
   }

   public TestCase_as_android_mpost_g4s_airport_470386352() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
