import android.renderscript.Allocation;
import android.renderscript.Type;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_creative_colorfit_mandala_coloring_book__187920940 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Allocation.class);
      Type var2 = ((Allocation)var1).getType();
      boolean var3 = var2.hasMipmaps();
   }
}
