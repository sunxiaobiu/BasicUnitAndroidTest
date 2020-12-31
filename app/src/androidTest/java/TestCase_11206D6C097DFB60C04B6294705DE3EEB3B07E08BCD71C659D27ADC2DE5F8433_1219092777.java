import android.app.Dialog;
import androidx.appcompat.app.AlertDialog;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_11206D6C097DFB60C04B6294705DE3EEB3B07E08BCD71C659D27ADC2DE5F8433_1219092777 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Dialog.class);
      AlertDialog var3 = (AlertDialog)var2;
      byte var1 = 1;
      var3.getButton(var1);
   }
}
