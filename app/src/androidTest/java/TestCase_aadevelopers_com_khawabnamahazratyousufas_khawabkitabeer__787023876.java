import android.graphics.EmbossMaskFilter;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aadevelopers_com_khawabnamahazratyousufas_khawabkitabeer__787023876 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Paint.class);
      Object var1 = EasyMock.createMock(EmbossMaskFilter.class);
      ((Paint)var2).setMaskFilter((MaskFilter)var1);
   }
}
