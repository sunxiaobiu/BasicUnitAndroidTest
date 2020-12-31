import android.support.v7.app.AlertDialog;
import android.widget.Button;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_vodafone_dreamlabapp__273711719 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(AlertDialog.class);
      Button var2 = ((AlertDialog)var1).getButton(-1);
   }
}
