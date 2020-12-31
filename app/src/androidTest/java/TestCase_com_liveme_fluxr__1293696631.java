import android.content.res.TypedArray;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_liveme_fluxr__1293696631 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(TypedArray.class);
      int var2 = ((TypedArray)var1).getLayoutDimension(0, "layout_width");
   }
}
