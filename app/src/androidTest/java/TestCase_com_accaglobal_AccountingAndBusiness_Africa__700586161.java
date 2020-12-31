import android.renderscript.Allocation;
import android.renderscript.ScriptC;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_accaglobal_AccountingAndBusiness_Africa__700586161 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(ScriptC.class);
      Object var1 = EasyMock.createMock(Allocation.class);
      byte var2 = 1;
      ((ScriptC)var3).bindAllocation((Allocation)var1, var2);
   }
}
