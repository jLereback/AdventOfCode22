package main.java.org.aoc;

import java.util.Arrays;

public class Day1 {
	public static void main(String[] args) {
		String cal = getCal();

		int sum;
		var calArray = cal.split("\\n\\n");
		for (int i = 0; i < calArray.length; i++) {
			var eachCal = calArray[i].split("\\n");
			sum = 0;
			for (String s : eachCal) {
				sum += Integer.parseInt(s);
			}
			calArray[i] = String.valueOf(sum);
		}
		System.out.println(part1(calArray));
		System.out.println(part2(calArray));
	}

	private static int part2(String[] calArray) {
		return Arrays.stream(calArray).mapToInt(Integer::parseInt).sorted().skip(calArray.length - 3).sum();
	}

	private static int part1(String[] calArray) {
		return Arrays.stream(calArray).mapToInt(Integer::parseInt).max().getAsInt();
	}

	private static String getCal() {
		return """
				6110
				2550
				6915
				5699
				4954
				5093
				3141
				5939
				4177
				3544
				5438
				5391
				3019
				   
				4691
				6961
				7515
				4545
				11145
				8346
				9225
				   
				9005
				2121
				4267
				1808
				3305
				9701
				1419
				   
				7178
				4921
				6687
				1918
				4856
				4538
				2786
				5071
				2689
				1803
				5763
				   
				12515
				15649
				17846
				14135
				   
				3290
				2875
				1184
				3166
				3473
				1683
				2706
				6297
				2900
				1684
				4688
				3074
				   
				3729
				6105
				7107
				7027
				5390
				11429
				8245
				   
				13381
				12304
				20944
				   
				18485
				   
				2108
				5008
				5779
				3539
				1633
				3957
				5475
				1345
				1526
				1809
				4355
				3237
				5006
				2573
				4353
				   
				1212
				5163
				3415
				3937
				2300
				3454
				4499
				3970
				5106
				3476
				5231
				5849
				5685
				3991
				   
				4916
				3093
				4965
				1996
				3298
				3331
				3564
				4052
				2850
				6755
				5818
				5390
				1179
				   
				4494
				1573
				5304
				5702
				2908
				3673
				1518
				2821
				3399
				3680
				1994
				1781
				3453
				5262
				2024
				   
				2817
				4683
				3484
				4726
				5292
				5647
				1371
				3251
				4694
				2239
				5457
				3252
				2558
				3081
				4813
				   
				6143
				6010
				4636
				1540
				2351
				1114
				1075
				1411
				2683
				2107
				1695
				1554
				6147
				1861
				   
				10945
				8590
				   
				17590
				15122
				2075
				   
				66239
				   
				4958
				6507
				9535
				5538
				2204
				8401
				6005
				   
				12195
				22957
				21872
				   
				6147
				5264
				6686
				2662
				9266
				10561
				9894
				1225
				   
				4431
				13046
				1127
				18157
				   
				3535
				5094
				7349
				7820
				6967
				3345
				7631
				6795
				5954
				2901
				   
				6202
				4413
				6345
				1171
				4765
				3423
				4403
				2940
				6516
				5968
				1697
				1868
				5429
				   
				17229
				10458
				1601
				   
				4637
				1385
				3460
				1955
				4774
				2037
				6428
				1620
				4279
				3459
				6101
				1027
				   
				5038
				5499
				5468
				3265
				4014
				4694
				3766
				3548
				5761
				5042
				4874
				5590
				1852
				2250
				5945
				   
				9655
				2813
				13235
				4421
				5676
				4059
				   
				4273
				11798
				11018
				12068
				1284
				10417
				2918
				   
				1358
				6723
				3461
				1450
				3975
				4723
				1166
				6732
				6140
				8746
				   
				1489
				1442
				13133
				12668
				12772
				   
				4116
				5431
				4612
				7136
				7684
				10312
				1377
				   
				4022
				5063
				3069
				4147
				3274
				2114
				2369
				5722
				4159
				4074
				4971
				1046
				5899
				5525
				2131
				   
				2422
				3086
				7519
				3820
				5993
				6375
				8142
				2993
				7202
				   
				9855
				36690
				   
				20852
				24060
				8384
				   
				6991
				21756
				4202
				   
				4029
				13074
				8711
				9491
				3020
				   
				10546
				4261
				6345
				1451
				3556
				7848
				1083
				7119
				   
				6059
				1982
				2101
				5916
				6447
				4244
				6947
				4484
				4184
				3602
				3309
				5663
				1453
				   
				5997
				3063
				4466
				1905
				4055
				3405
				5462
				2120
				5155
				4597
				2516
				   
				5803
				2603
				8894
				4316
				3949
				   
				4439
				4652
				3348
				2196
				4186
				2850
				2218
				1721
				6827
				4768
				7358
				   
				3004
				3210
				1281
				4206
				3540
				6025
				4411
				4765
				1782
				7126
				5710
				   
				3985
				7018
				1713
				7565
				2192
				6903
				4399
				6537
				1072
				6393
				2184
				   
				3443
				1385
				1670
				5400
				6885
				5391
				7668
				1248
				6523
				   
				20403
				21090
				1281
				   
				2435
				4119
				3181
				1687
				5239
				3980
				1274
				4202
				4218
				4174
				3090
				1417
				4875
				4176
				   
				1224
				10021
				2363
				7798
				8380
				10136
				5749
				   
				13994
				6701
				8270
				2278
				   
				3164
				4130
				1407
				3510
				2551
				5144
				3011
				3557
				5410
				5019
				1912
				5889
				5356
				1139
				   
				7704
				5596
				11858
				6497
				10778
				8479
				4638
				   
				2717
				8274
				14760
				2591
				1135
				   
				3752
				6482
				5847
				2548
				5054
				6225
				4262
				6461
				4939
				4170
				5185
				1956
				3863
				   
				4014
				5392
				6117
				8551
				5182
				6040
				7659
				3460
				6445
				3731
				   
				5137
				8809
				9393
				10116
				7912
				8936
				2821
				5535
				   
				4838
				2062
				3104
				4446
				5603
				1617
				1578
				3740
				5059
				2471
				1718
				4530
				2747
				1932
				2029
				   
				56887
				   
				8805
				8089
				3794
				8073
				3530
				3522
				2420
				5049
				5619
				   
				1200
				2268
				5872
				8108
				1220
				8411
				5234
				4288
				1117
				   
				2379
				4275
				3508
				4889
				4640
				3905
				7002
				2263
				7093
				2288
				3270
				   
				6171
				19996
				   
				4067
				4754
				6380
				2843
				8385
				4201
				7631
				4387
				2599
				7088
				   
				1522
				2360
				2515
				3834
				3958
				6926
				8060
				5358
				4355
				   
				19530
				   
				7501
				21086
				2310
				   
				3561
				1159
				5630
				6114
				4612
				1408
				3502
				4956
				5184
				5842
				2132
				1483
				   
				5056
				9746
				4504
				9019
				9021
				10289
				7094
				   
				4750
				11314
				   
				8676
				6672
				11494
				11044
				5380
				8643
				4934
				   
				1521
				1632
				2978
				5738
				5740
				4229
				5228
				1590
				4375
				3152
				2841
				6278
				5895
				   
				2120
				13307
				11773
				5906
				7961
				   
				20546
				   
				32304
				   
				6126
				9197
				1407
				4821
				11686
				2911
				1809
				   
				11052
				9610
				13895
				10903
				2730
				9753
				   
				25478
				4681
				   
				4588
				7758
				7746
				4496
				1521
				5217
				4325
				2242
				5547
				6018
				2099
				   
				5440
				4951
				4044
				3481
				4718
				1442
				4919
				5198
				1032
				5857
				4014
				1844
				3141
				6081
				3480
				   
				1311
				7390
				5777
				8124
				7703
				2441
				1849
				6597
				6202
				7848
				   
				8348
				10633
				15815
				1855
				8177
				   
				8951
				2899
				11227
				8207
				6741
				2921
				7614
				   
				3537
				1838
				2686
				5037
				1760
				3175
				3339
				3698
				1591
				3917
				5608
				3296
				5990
				   
				11248
				12466
				8712
				17366
				   
				6204
				3307
				6487
				1816
				2964
				4185
				5876
				1960
				3272
				7154
				   
				4264
				12009
				10916
				2329
				15852
				   
				2918
				3111
				1397
				6901
				3637
				8521
				1613
				4646
				1275
				   
				2378
				3601
				2856
				7283
				6269
				4980
				5453
				6274
				6481
				6402
				   
				9498
				   
				5368
				5215
				4931
				2638
				4925
				8673
				9606
				9301
				3330
				   
				19237
				   
				3272
				3631
				10887
				8302
				5286
				3006
				   
				5278
				10984
				9411
				1960
				9757
				4346
				   
				3852
				6281
				5839
				4446
				4445
				5711
				4111
				3201
				3258
				1236
				6237
				5595
				1089
				3002
				   
				3075
				9388
				3756
				6115
				4759
				2877
				4662
				2003
				   
				4686
				4103
				4316
				6771
				1945
				1138
				2938
				5802
				8579
				2573
				   
				8798
				2461
				6245
				5287
				11798
				10103
				3027
				   
				10348
				18709
				13427
				6693
				   
				8050
				5154
				3149
				7498
				7688
				6110
				3508
				8476
				   
				5567
				4365
				2847
				6503
				5903
				3712
				5377
				6888
				5713
				3586
				1586
				   
				6705
				3204
				7685
				4453
				8534
				5651
				5065
				8081
				6133
				1149
				   
				4483
				4954
				4851
				3999
				4945
				1362
				4185
				3725
				2950
				5058
				2254
				1800
				1842
				4694
				3281
				   
				6208
				5547
				3600
				4001
				2231
				4922
				5790
				1948
				4573
				3413
				4322
				4293
				4824
				1527
				   
				29021
				   
				2898
				3348
				3531
				5600
				2971
				3338
				5408
				4321
				3717
				4008
				2507
				1941
				2752
				5526
				3739
				   
				2697
				5679
				1433
				6811
				3980
				4167
				6041
				4697
				2502
				6879
				2025
				4208
				1228
				   
				4445
				2147
				7149
				5364
				5550
				2898
				1065
				3657
				6576
				6055
				3931
				5395
				   
				1303
				3297
				4116
				4097
				3206
				4908
				3991
				3820
				5987
				2689
				1026
				4494
				5668
				2364
				   
				3759
				7034
				12531
				6043
				5183
				2198
				   
				4924
				2362
				2522
				4904
				6009
				1737
				6787
				6494
				5298
				2737
				3593
				4537
				1031
				   
				4021
				3441
				2569
				1275
				6548
				8416
				5307
				3190
				3818
				2723
				   
				8685
				7967
				7708
				11926
				   
				12403
				9683
				13631
				10653
				7314
				   
				7316
				3547
				1915
				3356
				1414
				1492
				4886
				5530
				4692
				3502
				6184
				3557
				   
				5851
				4399
				2012
				2190
				2617
				2159
				2862
				1893
				2469
				2989
				5449
				2108
				1048
				2542
				1284
				   
				3705
				3689
				3695
				3966
				1879
				2717
				4394
				2586
				7253
				2340
				7181
				   
				18748
				3187
				11786
				   
				4576
				3311
				6355
				9688
				1070
				9779
				10843
				   
				6286
				2030
				1457
				3321
				2340
				5372
				2472
				2688
				3481
				3520
				2017
				4052
				3613
				   
				8703
				3801
				5806
				1194
				9099
				8051
				6266
				4389
				2806
				   
				8497
				6721
				4559
				5379
				8359
				2283
				3251
				8600
				3045
				3892
				   
				5771
				4622
				6452
				2910
				1336
				2028
				4483
				2200
				1261
				7928
				4897
				   
				4063
				5564
				4386
				4480
				7427
				7328
				4097
				4660
				2058
				2435
				1404
				   
				1765
				4959
				3595
				5417
				2459
				3727
				1003
				3933
				2074
				3492
				5181
				2748
				2691
				4250
				2233
				   
				6427
				2023
				5347
				4376
				3351
				5329
				7656
				3114
				2242
				6535
				5010
				   
				6335
				1288
				1509
				5055
				6435
				4259
				3766
				5446
				2275
				5759
				1658
				5648
				6337
				3140
				   
				19523
				9958
				7466
				10185
				   
				5056
				3745
				6112
				3496
				2919
				3307
				10013
				   
				5709
				1141
				6752
				14817
				1570
				   
				5994
				19335
				17039
				   
				8057
				7193
				6660
				10996
				4355
				7284
				9163
				   
				7243
				13354
				3937
				12804
				8327
				8024
				   
				1665
				11179
				17488
				   
				6093
				6097
				1884
				5083
				9616
				5268
				5129
				6153
				1145
				   
				7401
				2094
				4488
				5499
				6029
				7359
				1952
				3834
				4051
				3015
				2400
				5203
				   
				1037
				5318
				2600
				1438
				1882
				1667
				2577
				4671
				4614
				5335
				4666
				   
				3209
				4139
				1011
				6467
				3874
				2866
				2997
				1588
				1474
				4173
				1393
				4486
				   
				6091
				3128
				6230
				3830
				3837
				6176
				2659
				3036
				5598
				3045
				5889
				1270
				5451
				   
				2284
				5647
				5472
				2536
				2632
				1354
				2409
				5948
				3176
				5061
				1342
				1929
				3111
				2807
				2756
				   
				4056
				6430
				16073
				15446
				   
				8687
				   
				2610
				15342
				3943
				14628
				3545
				   
				4230
				4793
				2361
				4513
				5144
				6035
				3039
				5388
				5081
				3138
				4288
				2933
				1584
				2471
				   
				9066
				2772
				8183
				12049
				3585
				8452
				6792
				   
				3243
				1533
				5460
				5187
				1851
				3515
				4662
				3355
				5089
				3764
				1723
				4719
				5292
				5615
				1794
				   
				8661
				16368
				6930
				11440
				   
				35648
				   
				5079
				13796
				11334
				4677
				   
				8876
				24018
				16839
				   
				5092
				3404
				5504
				1093
				2884
				3871
				1341
				1652
				6410
				2617
				5703
				5414
				3033
				4846
				   
				29773
				   
				9474
				7432
				8272
				2002
				2667
				2456
				8304
				6334
				7922
				   
				4886
				5478
				3204
				3276
				2449
				3768
				1075
				6172
				1986
				6177
				3934
				3968
				4794
				4506
				   
				13497
				14301
				13442
				   
				61887
				   
				5216
				2359
				5537
				12769
				12794
				6740
				   
				5664
				2729
				5686
				3513
				2411
				3689
				2650
				3459
				2400
				3676
				4652
				4985
				3850
				1949
				1900
				   
				2841
				5334
				1280
				5989
				6006
				3916
				1715
				5624
				1476
				1209
				3713
				1376
				2545
				5123
				3985
				   
				2390
				1661
				4703
				6098
				4512
				3216
				2999
				6252
				1394
				1895
				1913
				1801
				3159
				   
				3322
				11142
				10847
				3906
				1419
				2000
				7233
				   
				2702
				1048
				5466
				6814
				3528
				3644
				4044
				2019
				4490
				1737
				6813
				5015
				   
				7855
				9990
				8750
				8581
				2368
				9358
				1568
				7690
				   
				2953
				1038
				6875
				4560
				6581
				6293
				2047
				1900
				6416
				5569
				4654
				5415
				4408
				   
				3720
				2562
				2393
				4639
				3641
				2911
				1312
				2697
				6195
				6576
				3644
				3128
				   
				28955
				5123
				   
				8445
				   
				4703
				12165
				7074
				   
				11707
				13879
				7866
				   
				4800
				5449
				2036
				5941
				4559
				2548
				4644
				4543
				2322
				2036
				3908
				5780
				5345
				2549
				1751
				   
				7859
				10697
				10414
				8986
				1373
				3111
				7807
				   
				2938
				4802
				5235
				3940
				2567
				2461
				7133
				4883
				2447
				1032
				3587
				5788
				   
				3080
				13380
				7178
				6656
				10753
				11646
				   
				1948
				3803
				1627
				1426
				6886
				1633
				1545
				3274
				6768
				3241
				4031
				   
				15127
				1778
				14074
				11149
				   
				4026
				3948
				5822
				2855
				2093
				6113
				5983
				1709
				6000
				4552
				2594
				1152
				2799
				1401
				   
				3226
				9386
				6030
				7930
				6490
				5736
				1574
				2360
				3167
				   
				8084
				7950
				10634
				2320
				3186
				4598
				9171
				7892
				   
				4968
				10880
				13264
				11047
				12412
				3450
				   
				28780
				26728
				   
				7945
				1296
				1773
				5426
				7765
				1785
				2377
				2434
				7809
				4140
				3727
				   
				1308
				6148
				21591
				   
				23972
				19371
				   
				5256
				12843
				23975
				   
				5911
				1161
				4312
				2088
				7105
				3023
				3772
				1650
				5065
				2713
				4336
				5514
				   
				5847
				11518
				11799
				11015
				3026
				10915
				1483
				   
				21170
				   
				2317
				5499
				4732
				5102
				2989
				3648
				1868
				1910
				5775
				3761
				2119
				3636
				1272
				1199
				2256
				   
				7780
				   
				9298
				16719
				25032
				   
				22138
				34813
				   
				4414
				2839
				1057
				5746
				5992
				3241
				6411
				4296
				3151
				6393
				3580
				6848
				2757
				   
				2137
				2976
				13805
				10178
				   
				1209
				5133
				6097
				3798
				1191
				5846
				1664
				6348
				3490
				6995
				   
				5102
				1531
				2487
				5914
				9420
				7252
				5464
				5663
				   
				7279
				1823
				1050
				4389
				7430
				5169
				7345
				1029
				7268
				7171
				1084
				5147
				   
				7352
				4540
				2007
				10929
				11713
				10909
				1151
				   
				10392
				5900
				10100
				11267
				11785
				11833
				8224
				   
				52397
				   
				4210
				2185
				7522
				2334
				1478
				3920
				2883
				6788
				4548
				6152
				3280
				   
				3410
				5271
				2300
				1970
				3784
				3548
				1977
				3077
				3306
				1020
				2594
				6537
				   
				5309
				9473
				16702
				   
				7650
				13750
				   
				17582
				4937
				12672
				   
				29349
				20611
				   
				6546
				7623
				1911
				2747
				7617
				3987
				7752
				5852
				1233
				1540
				4073
				   
				5695
				3845
				4041
				8076
				9015
				4289
				4259
				9920
				   
				5573
				2607
				4056
				2369
				3969
				1080
				2130
				6473
				2130
				3372
				4051
				3963
				2606
				5906
				   
				26141
				19389
				   
				12853
				12859
				3938
				9501
				1818
				5496
				   
				6529
				5972
				9280
				   
				9836
				3884
				4956
				10149
				5736
				5586
				2755
				   
				17543
				8648
				17976
				13773
				   
				1694
				3739
				2053
				1096
				2150
				1489
				4221
				3229
				2995
				4264
				1196
				3597
				3499
				4516
				2236
				   
				5612
				6240
				4378
				1014
				2163
				1935
				3429
				2831
				4749
				4245
				2239
				4559
				1693
				5657
				   
				11226
				1962
				9824
				10528
				6845
				6882
				3890
				   
				1975
				2792
				8087
				1459
				3226
				2909
				1094
				7529
				8035
				3212
				3353
				   
				13079
				18234
				   
				5218
				4074
				1663
				7056
				1783
				1857
				5490
				3184
				6300
				6151
				3879
				   
				2316
				1182
				2366
				4076
				1226
				3753
				6822
				4650
				2065
				6703
				3732
				1622
				   
				4283
				6886
				1713
				7954
				1408
				8538
				8336
				7599
				2739
				4374
				   
				4884
				4508
				4068
				2780
				1107
				2157
				3272
				5580
				1487
				4923
				1167
				5056
				2323
				2094
				4311
				   
				3709
				1743
				3607
				4700
				5983
				6508
				7310
				4932
				2986
				7994
				4138
				   
				2564
				5468
				7511
				3466
				7763
				4015
				6306
				2291
				7884
				1256
				3286
				   
				26272
				18770
				   
				10655
				4092
				13958
				19758
				   
				4937
				2529
				6704
				11459
				9749
				5660
				   
				5757
				2813
				2548
				5686
				1350
				2079
				5652
				3366
				2101
				4620
				6250
				2971
				3762
				6068
				   
				22115
				   
				15523
				15141
				12498
				2271
				   
				2307
				5729
				1509
				3105
				3410
				3816
				4078
				5564
				4357
				2989
				6192
				1974
				5607
				6183
				   
				4548
				1955
				1227
				9884
				6622
				6663
				2549
				   
				34829
				10698
				   
				1891
				3378
				1535
				5895
				8254
				3232
				6831
				5472
				7545
				6751
				   
				2971
				2462
				8484
				3898
				1911
				7516
				1435
				7853
				6027
				6130
				   
				59206
				   
				7822
				1506
				13885
				1017
				5150
				   
				6677
				3808
				14470
				1962
				   
				2816
				8043
				1593
				4462
				7112
				8563
				9026
				1660
				5553
				   
				5282
				4451
				1256
				7336
				3724
				2212
				5895
				2488
				8009
				1457
				7634
				   
				9604
				   
				3927
				10103
				5636
				11401
				12234
				   
				11006
				17248
				   
				10936
				8651
				10252
				7868
				7295
				3070
				1520
				   
				12324
				5230
				3847
				9922
				5525
				6929
				   
				13863
				1248
				13247
				11387
				6677
				9255
				   
				23703
				8659
				10869
				   
				7358
				2431
				3112
				4743
				6684
				6343
				4335
				1058
				8303
				1262
				   
				9600
				1977
				4524
				12701
				7686
				1120
				   
				27377
				9632
				   
				10910
				14343
				   
				6305
				5171
				3950
				4167
				2806
				5576
				5066
				4874
				3260
				7138
				5510
				3732
				   
				20922
				8396
				4707
				   
				1965
				3603
				1494
				4544
				4911
				1179
				2335
				1333
				2831
				4394
				5038
				6068
				3449
				5419
				   
				4597
				3641
				5977
				3109
				5448
				5290
				3587
				3195
				4096
				4134
				6191
				6420
				3329
				5404""";
	}
}