import android.app.PendingIntent;
import android.content.Intent;
import android.media.RemoteControlClient;
import android.media.RemoteControlClient.MetadataEditor;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0800C6B61769AE081A7B9BDAC61488257470B407FBB9200D847720542BA44599__509053365 {
   @Test
   public void testCase() throws Exception {
      Intent var2 = new Intent("android.intent.action.MEDIA_BUTTON");
      MyService var1 = new MyService();
      PendingIntent var3 = PendingIntent.getBroadcast(var1, 0, var2, 0);
      RemoteControlClient var5 = new RemoteControlClient(var3);
      MetadataEditor var4 = var5.editMetadata(true);
   }
}
