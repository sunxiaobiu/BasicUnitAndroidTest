import android.content.res.TypedArray;
import androidx.core.content.res.TypedArrayUtils;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParser;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C__364982618 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(TypedArray.class);
      Object var1 = null;
      byte var2 = 1;
      TypedArrayUtils.getNamedFloat((TypedArray)var0, (XmlPullParser)var1, "startX", var2, 0.0F);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
