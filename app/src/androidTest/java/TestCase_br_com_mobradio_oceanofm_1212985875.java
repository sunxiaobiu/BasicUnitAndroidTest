import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_br_com_mobradio_oceanofm_1212985875 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Intent.class);
      Parcelable var3 = ((Intent)var2).getParcelableExtra("br.com.mobradio.radiojovempambh.RECEIVER");
      ResultReceiver var4 = (ResultReceiver)var3;
      Object var1 = EasyMock.createMock(Bundle.class);
      var4.send(1, (Bundle)var1);
   }
}
