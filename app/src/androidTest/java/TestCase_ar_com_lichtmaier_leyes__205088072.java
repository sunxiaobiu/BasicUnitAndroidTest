import android.app.Activity;
import android.app.Activity;
import android.nfc.NfcAdapter;
import android.nfc.NfcAdapter.CreateNdefMessageCallback;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_leyes__205088072 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var4 = this.mActivityRule;
      Activity var5 = var4.getActivity();
      NfcAdapter var1 = NfcAdapter.getDefaultAdapter(var5);
      Object var2 = null;
      Object var3 = EasyMock.createMock(Activity[].class);
      var1.setNdefPushMessageCallback((CreateNdefMessageCallback)var2, var5, (Activity[])var3);
   }

   public TestCase_ar_com_lichtmaier_leyes__205088072() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
