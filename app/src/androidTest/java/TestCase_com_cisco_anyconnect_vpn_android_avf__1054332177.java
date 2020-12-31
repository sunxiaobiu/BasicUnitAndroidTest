import android.database.MatrixCursor;
import android.database.MatrixCursor.RowBuilder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cisco_anyconnect_vpn_android_avf__1054332177 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(String[].class);
      MatrixCursor var1 = new MatrixCursor((String[])var3);
      RowBuilder var4 = var1.newRow();
      String var5 = "android";
      String var2 = "android";
      var4.add(var5, var2);
   }
}
