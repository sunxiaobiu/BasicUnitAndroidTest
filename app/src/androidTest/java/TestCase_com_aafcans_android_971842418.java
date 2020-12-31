import android.content.Intent;
import android.nfc.Tag;
import android.os.Parcelable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aafcans_android_971842418 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Intent.class);
      Parcelable var2 = ((Intent)var1).getParcelableExtra("android.nfc.extra.TAG");
      Tag var3 = (Tag)var2;
      String[] var4 = var3.getTechList();
   }
}
