import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_brightsolid_familyhouse_1154806730 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(OnClickListener.class);
      Object var1 = EasyMock.createMock(DialogInterface.class);
      byte var2 = 1;
      ((OnClickListener)var3).onClick((DialogInterface)var1, var2);
   }
}
