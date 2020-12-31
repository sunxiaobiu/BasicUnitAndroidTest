import android.content.Intent;
import android.nfc.Tag;
import android.os.Parcelable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amdroidalarmclock_amdroid_1152067391 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Intent.class);
      Parcelable var2 = ((Intent)var1).getParcelableExtra("android.nfc.extra.TAG");
      Tag var3 = (Tag)var2;
      var3.toString();
   }
}
