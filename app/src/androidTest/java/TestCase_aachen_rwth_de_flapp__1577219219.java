import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp__1577219219 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Intent.class);
      Parcelable var3 = ((Intent)var2).getParcelableExtra("key_receiver_tag");
      ResultReceiver var4 = (ResultReceiver)var3;
      Object var1 = EasyMock.createMock(Bundle.class);
      var4.send(2, (Bundle)var1);
   }
}
