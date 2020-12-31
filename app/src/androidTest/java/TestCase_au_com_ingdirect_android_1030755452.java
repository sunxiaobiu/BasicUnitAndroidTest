import android.os.CancellationSignal;
import android.os.CancellationSignal.OnCancelListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_ingdirect_android_1030755452 {
   @Test
   public void testCase() throws Exception {
      CancellationSignal var2 = new CancellationSignal();
      Object var1 = EasyMock.createMock(OnCancelListener.class);
      var2.setOnCancelListener((OnCancelListener)var1);
   }
}
