import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_wifianalyzerpro__762867943 {
   @Test
   public void testCase() throws Exception {
      Intent var2 = new Intent();
      Object var1 = EasyMock.createMock(Uri.class);
      var2.putExtra("android.intent.extra.STREAM", (Parcelable)var1);
   }
}
