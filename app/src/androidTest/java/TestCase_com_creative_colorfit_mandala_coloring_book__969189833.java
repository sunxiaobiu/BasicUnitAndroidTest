import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.Type;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_creative_colorfit_mandala_coloring_book__969189833 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Allocation.class);
      Type var3 = ((Allocation)var2).getType();
      Element var4 = var3.getElement();
      Object var1 = EasyMock.createMock(Element.class);
      var4.isCompatible((Element)var1);
   }
}
