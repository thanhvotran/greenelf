package com.example.user.greenelf;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FindFragment extends Fragment {

    View v;

    GarbageAdapter garbageAdapter;

    ArrayList<DataGarbage> arrayList = new ArrayList<>();

    public FindFragment() {
        arrayList.add(new DataGarbage(R.drawable.thucanthua,"Thức ăn thừa",
                "Phần không dùng đến sau mỗi bữa ăn đã ôi thiu, quá hạn sử dụng,…",
                "Rác thải hữu cơ, thành phần chính là tinh bột, protein, chất xơ dễ phân hủy,…",
                "Rác thải hữu cơ, thành phần chính là tinh bột, protein, chất xơ dễ phân hủy,…"));

        arrayList.add(new DataGarbage(R.drawable.baseline_search_black_24dp,"Rau, củ hư hỏng",
                "Phần gốc, thân cứng, già của rau, vỏ ngoài của các loại củ",
                "Rác thải hữu cơ, thành phần chính là tinh bột, protein, chất xơ dễ phân hủy,…",
                "Trước khi thu để chất thải ráo nước, cho vào thùng phân loại ngăn Rác thải hữu cơ. Nếu có nhu cầu trồng trọt, sử sụng thùng ủ phân hữu cơ để biến số rác thải này thành phân bón. Trong quá trình phân hủy các loại rác sẽ lên men, gây ra mùi. Vì vậy nên để thùng ủ nơi thoáng khí, có nhiều ánh sáng."));

        arrayList.add(new DataGarbage(R.drawable.hoakho,"Hoa",
                "Hoa dùng trong trang trí sau khi đã héo, tàn",
                "Rác thải hữu cơ, thành phần chính là cellulose,…",
                "Trước khi thu để chất thải ráo nước, cho vào thùng phân loại ngăn Rác thải hữu cơ. Nếu có nhu cầu trồng trọt, sử sụng thùng ủ phân hữu cơ để biến số rác thải này thành phân bón. Trong quá trình phân hủy các loại rác sẽ lên men, gây ra mùi. Vì vậy nên để thùng ủ nơi thoáng khí, có nhiều ánh sáng."));

        arrayList.add(new DataGarbage(R.drawable.bache,
                "Bã chè, cà phê",
                "Được thải bỏ sau khi sử dụng lấy nước pha",
                "Rác thải hữu cơ, thành phần chính là chất xơ trung tính,…",
                "Trước khi thu để chất thải ráo nước, cho vào thùng phân loại ngăn Rác thải hữu cơ. Nếu có nhu cầu trồng trọt, sử sụng thùng ủ phân hữu cơ để biến số rác thải này thành phân bón. Trong quá trình phân hủy các loại rác sẽ lên men, gây ra mùi. Vì vậy nên để thùng ủ nơi thoáng khí, có nhiều ánh sáng."));

        arrayList.add(new DataGarbage(R.drawable.lakho,"Lá khô rụng",
                "Quá trình sinh trưởng của thực vật gây ra, một số loại cây có thể rụng theo mùa ",
                "Rác thải hữu cơ, thành phần chính là cellulose,…",
                "Tiến hành quét, thu dọn cho vào thùng phân loại ngăn Rác thải hữu cơ. "));

        arrayList.add(new DataGarbage(R.drawable.baseline_search_black_24dp,"Mica (Thủy tinh hữu cơ)",
                "Rác văn phòng như biển tên, kệ, bàn, hộp làm bằng mica",
                "Rác thải hữu cơ, bị đốt cháy ở 460℃",
                "Thu gom, để trong túi đựng riêng với các loại thực phẩm"));

        arrayList.add(new DataGarbage(R.drawable.baseline_search_black_24dp,"Tăm, đũa dùng 1 lần",
                "Phát sinh do hoạt động ăn uống",
                "Rác thải hữu cơ, thành phần chính là cellulose,…",
                "Thu gom, để trong túi đựng riêng với các loại thực phẩm"));

        arrayList.add(new DataGarbage(R.drawable.tanthuoc,"Tàn thuốc lá, giấy vụn, gỗ vụn, hàng đồ da, băng vệ sinh, tã giấy, cành cây cắt tỉa trong vườn, đầu bút chì,…",
                "Do quá trình sinh hoạt hằng ngày",
                "Loại rác có thể đốt cháy hoàn toàn ở nhiệt độ cao trong lò đốt rác",
                "Thu gom, cành cây phải được cắt ngắn và bó lại trước khi mang thải bỏ"));

        arrayList.add(new DataGarbage(R.drawable.baseline_search_black_24dp,"Sản phẩm làm từ nhựa Vinyl, nhựa dẻo như giày thể thao, dép xốp, sản phẩm da nhân tạo, đồ gốm, thủy tinh pha lê, lọ mỹ phẩm,...",
                "Sản phẩm đã dùng hỏng, chén đĩa vỡ,…",
                "Không đốt cháy hoặc khi đốt gây ra các chất độc hại",
                "Thu gom cho vào túi riêng"));

        arrayList.add(new DataGarbage(R.drawable.hopnhua,"Các loại bao bì, hộp đựng thực phẩm, chai, can nhựa,…",
                "Phát sinh nhiều do nhu cầu đóng gói, bảo quản thức ăn, túi chứa vật khác,…",
                "Thuộc 1 loại rác tài nguyên, có thể tái sinh. Sản xuất từ dầu mỏ và 1 số hóa chất khác, có nhiều chủng loại nhựa khác nhau, ",
                "Rửa sạch đối vs các hộp và túi đựng thực phẩm, vẩy hết nước, xếp lại và cho vào túi đựng."));

        arrayList.add(new DataGarbage(R.drawable.rgiayvun,"Giấy các loại (Tờ rơi quảng cáo, báo, sách vở), giấy gói hàng, hộp giấy đựng hàng, thùng carton, hộp sữa,…",
                "Rác từ văn phòng, trường học, gia đình, kho bãi đóng gói hàng hóa thường chứa các loại rác là giấy.",
                "Thuộc 1 loại rác tài nguyên, có thể tái sinh.",
                "Thu gom giấy và xếp theo kích cỡ, buộc dây chữ thập, tránh để bị ướt. Có thể cho vào thùng lớn hoặc bao dựng khi bỏ ra."));

        arrayList.add(new DataGarbage(R.drawable.donhabep,"Các loại nồi niêu hỏng, đồ hộp, lon nước ngọt, chai gia vị hoặc nước uống,…",
                "Sau khi sử dụng thực phẩm được thải ra",
                "Thuộc 1 loại rác tài nguyên, có thể tái sinh.",
                "Sau khi sử dụng rửa sạch bên trong, có thể đập dẹp đối với lon kim loại, xếp vào bao để thu gom tái chế."));

        arrayList.add(new DataGarbage(R.drawable.tvcu,"Những loại rác như bóng đèn hỏng, pin, ắc quy, thiết bị điện gia dụng, các loại dao kéo hoặc vật sắc bén, nhiệt kế, mực in, chai thuốc bảo vệ thực vật hoặc chứa dầu phế thải, bật lửa, các loại chai xịt nén khí, chai lọ thủy tinh và gương đã vỡ, dầu nhớt các loại, rác y tế…",
                "Đồ dùng nhà bếp hỏng, thiết bị y tế, chất thải máy móc,…",
                "Rác nguy hại: chứa các chất độc hại hoặc gây tổn thương nếu tiếp xúc.",
                "Không để lẫn với loại rác khác, nên ghi chú “Rác nguy hại” trên bao đựng để cảnh báo. \n" +
                        "Đối với chai xịt nén khí có thể nổ, nên xì hết khí ra trước khi thải.\n" +
                        "Rác y tế phải được thu gom riêng.\n" +
                        "Mảnh vỡ sắc nhọn của thủy tinh và gương nên gói lại và cho vào bao đựng.\n"));

        arrayList.add(new DataGarbage(R.drawable.tugo,"Đồ gia dụng cỡ lớn (bàn ghế, tủ kệ, tủ lạnh, sofa,…), nệm, thảm trải sàn lớn, chiếu, cửa hỏng,… (thường kích cỡ trên 1m2)",
                "Bị thải bỏ khi hư hỏng hoặc chủ nhà có nhu cầu đổi mới",
                "Rác khổng lồ, chiếm diện tích và nhiều loại khác nhau.",
                "Đổi với người thu mua đồ cũ. Nếu vứt bỏ nên để nơi đổ rác mà xe tải có thể lưu thông. \n" +
                        "Nếu là bàn ghế cũ có thể cắt ngắn và bỏ vào rác đốt được.\n"));

        arrayList.add(new DataGarbage(R.drawable.tuida,"Quần áo cũ, khăn trải bàn, drap giường, chăn, các loại túi, balo vải,…",
                "Quần áo vật dụng để lâu, hỏng, rách,…",
                "Rác đốt được, có thể sử dụng lại.",
                "Quần áo vải vóc nên soạn ra, có thể tặng lại hoặc tái chế thành vật dụng khác (giẻ lau, thảm,...)\n" +
                        "Xếp vào túi, tránh để bị ướt cho đến khi thu gom.\n"));
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_find, container, false);

        final RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.listRecyclerview);

        garbageAdapter = new GarbageAdapter(arrayList, this.getActivity());
        recyclerView.setAdapter(garbageAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);


        EditText editText = (EditText)v.findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

        return v;
    }

    private void filter(String text){
        ArrayList<DataGarbage> filteredList = new ArrayList<>();

        for (DataGarbage item : arrayList){
            if(item.getTen().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }

        garbageAdapter.filterList(filteredList);
    }
}
