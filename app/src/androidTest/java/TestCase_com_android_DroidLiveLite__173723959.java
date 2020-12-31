import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Parcelable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_android_DroidLiveLite__173723959 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Intent.class);
      Parcelable var2 = ((Intent)var1).getParcelableExtra("android.bluetooth.device.extra.DEVICE");
      BluetoothDevice var3 = (BluetoothDevice)var2;
      var1 = null;
      String var4 = ((BluetoothDevice)var1).toString();
   }
}
