import android.content.Intent;
import android.content.IntentSender;
import androidx.fragment.app.FragmentActivity;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_antenas__939373570 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(FragmentActivity.class);
      Object var1 = EasyMock.createMock(IntentSender.class);
      Object var2 = EasyMock.createMock(Intent.class);
      ((FragmentActivity)var3).startIntentSenderForResult((IntentSender)var1, 152, (Intent)var2, 0, 0, 0);
   }
}
